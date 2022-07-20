package com.bankaya.soap.core.mapper;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.bankaya.soap.core.model.json.AbilityResource;
import com.bankaya.soap.core.model.json.CommonItem;
import com.bankaya.soap.core.model.json.GameIndiceResource;
import com.bankaya.soap.core.model.json.HeltItemResource;
import com.bankaya.soap.core.model.json.MoveResource;
import com.bankaya.soap.core.model.json.PokeApiResponse;
import com.bankaya.soap.core.model.json.SpriteResource;
import com.bankaya.soap.core.model.json.StatResource;
import com.bankaya.soap.core.model.json.TypeResource;
import com.pokeapi.soap.generation.Abilities;
import com.pokeapi.soap.generation.AbilityResource.Ability;
import com.pokeapi.soap.generation.FormResource;
import com.pokeapi.soap.generation.Forms;
import com.pokeapi.soap.generation.GameIndice;
import com.pokeapi.soap.generation.GameIndice.Version;
import com.pokeapi.soap.generation.GameIndices;
import com.pokeapi.soap.generation.HeldItem;
import com.pokeapi.soap.generation.HeldItem.Item;
import com.pokeapi.soap.generation.HeldItem.VersionDetails;
import com.pokeapi.soap.generation.HeldItem.VersionDetails.VersionDetail;
import com.pokeapi.soap.generation.HeldItems;
import com.pokeapi.soap.generation.MoveResource.Move;
import com.pokeapi.soap.generation.MoveResource.VersionGroupDetails;
import com.pokeapi.soap.generation.MoveResource.VersionGroupDetails.VersionGroupDetail;
import com.pokeapi.soap.generation.MoveResource.VersionGroupDetails.VersionGroupDetail.MoveLearnMethod;
import com.pokeapi.soap.generation.MoveResource.VersionGroupDetails.VersionGroupDetail.VersionGroup;
import com.pokeapi.soap.generation.Moves;
import com.pokeapi.soap.generation.PokeApi;
import com.pokeapi.soap.generation.Species;
import com.pokeapi.soap.generation.Sprites;
import com.pokeapi.soap.generation.Sprites.Other;
import com.pokeapi.soap.generation.Sprites.Versions;
import com.pokeapi.soap.generation.StatResource.Stat;
import com.pokeapi.soap.generation.Stats;
import com.pokeapi.soap.generation.TypeResource.Type;
import com.pokeapi.soap.generation.Types;

@Component
public class PokeApiMapper {

  public PokeApi convertPokeApiJsonToXml(PokeApiResponse pokeApiResponse) {
    PokeApi pokeApiXml = new PokeApi();

    pokeApiXml.setAbilities(this.convertJsonAbilitiesToXml(pokeApiResponse.getAbilities()));
    pokeApiXml.setBaseExperience(pokeApiResponse.getBaseExperience());
    pokeApiXml.setForms(this.convertJsonFormsToXml(pokeApiResponse.getForms()));
    pokeApiXml.setGameIndices(this.convertJsonGameIndicesToXml(pokeApiResponse.getGameIndices()));
    pokeApiXml.setHeight(pokeApiResponse.getHeight());
    pokeApiXml.setHeldItems(this.convertJsonHeldItemsToXml(pokeApiResponse.getHeldItems()));
    pokeApiXml.setIsDefault(pokeApiResponse.isDefault());
    pokeApiXml.setLocationAreaEncounters(pokeApiResponse.getLocationArea());
    pokeApiXml.setMoves(this.convertJsonMovesToXml(pokeApiResponse.getMoves()));
    pokeApiXml.setName(pokeApiResponse.getName());
    pokeApiXml.setOrder(pokeApiResponse.getOrder());
    pokeApiXml.getPastTypes().addAll(pokeApiResponse.getPastTypes());
    pokeApiXml.setSpecies(this.convertJsonSpeciesToXml(pokeApiResponse.getSpecies()));
    pokeApiXml.setSprites(this.convertJsonSpritesToXml(pokeApiResponse.getSprites()));
    pokeApiXml.setStats(this.convertJsonStatsToXml(pokeApiResponse.getStats()));
    pokeApiXml.setTypes(this.convertJsonTypesToXml(pokeApiResponse.getTypes()));
    pokeApiXml.setWeight(pokeApiResponse.getWeight());
    pokeApiXml.setId(pokeApiResponse.getId());

    return pokeApiXml;
  }


  public Abilities convertJsonAbilitiesToXml(List<AbilityResource> abilities) {

    Abilities abilitiesXml = new Abilities();
    abilitiesXml.getAbilityResource().addAll(abilities.stream()
        .map(ability -> this.convertAbilityResourceToXml(ability)).collect(Collectors.toList()));

    return abilitiesXml;
  }


  private com.pokeapi.soap.generation.AbilityResource convertAbilityResourceToXml(
      AbilityResource ability) {

    com.pokeapi.soap.generation.AbilityResource abilityResource =
        new com.pokeapi.soap.generation.AbilityResource();

    com.pokeapi.soap.generation.AbilityResource.Ability abilityXml = new Ability();
    abilityXml.setName(ability.getAbility().getName());
    abilityXml.setUrl(ability.getAbility().getUrl());

    abilityResource.setIsHidden(ability.isHidden());
    abilityResource.setSlot(ability.getSlot());
    abilityResource.setAbility(abilityXml);

    return abilityResource;
  }


  private Forms convertJsonFormsToXml(List<CommonItem> forms) {
    Forms formsXml = new Forms();
    formsXml.getFormResource().addAll(
        forms.stream().map(form -> this.convertFormResourceXml(form)).collect(Collectors.toList()));
    return formsXml;
  }

  private FormResource convertFormResourceXml(CommonItem form) {

    FormResource formXml = new FormResource();
    formXml.setName(form.getName());
    formXml.setUrl(form.getUrl());

    return formXml;
  }


  public GameIndices convertJsonGameIndicesToXml(List<GameIndiceResource> gameIndices) {
    GameIndices gameIndicesXml = new GameIndices();

    gameIndicesXml.getGameIndice().addAll(gameIndices.stream()
        .map(gameIndice -> this.convertGameIndicesToXml(gameIndice)).collect(Collectors.toList()));

    return gameIndicesXml;
  }

  private GameIndice convertGameIndicesToXml(GameIndiceResource gameIndices) {
    GameIndice gameIndiceXml = new GameIndice();
    gameIndiceXml.setGameIndex(gameIndices.getGameIndex());

    GameIndice.Version version = new Version();
    version.setName(gameIndices.getVersion().getName());
    version.setUrl(gameIndices.getVersion().getUrl());

    gameIndiceXml.setVersion(version);
    return gameIndiceXml;
  }


  public HeldItems convertJsonHeldItemsToXml(List<HeltItemResource> heldItems) {
    HeldItems heldItemsXml = new HeldItems();

    heldItemsXml.getHeldItem().addAll(heldItems.stream()
        .map(heldItem -> this.convertHeldItemXml(heldItem)).collect(Collectors.toList()));

    return heldItemsXml;
  }

  private HeldItem convertHeldItemXml(HeltItemResource heldItem) {
    HeldItem.Item item = new Item();
    item.setName(heldItem.getItem().getName());
    item.setUrl(heldItem.getItem().getUrl());

    HeldItem.VersionDetails versionDetails = new VersionDetails();
    versionDetails.getVersionDetail()
        .addAll(heldItem.getVersionDetails().stream()
            .map(versionDetail -> this.convertVersionDetailXml(versionDetail))
            .collect(Collectors.toList()));

    HeldItem heldItemXml = new HeldItem();
    heldItemXml.setItem(item);
    heldItemXml.setVersionDetails(versionDetails);

    return heldItemXml;
  }


  private HeldItem.VersionDetails.VersionDetail convertVersionDetailXml(
      com.bankaya.soap.core.model.json.VersionDetails versionDetail) {

    HeldItem.VersionDetails.VersionDetail.Version version =
        new HeldItem.VersionDetails.VersionDetail.Version();

    version.setName(versionDetail.getVersion().getName());
    version.setUrl(versionDetail.getVersion().getUrl());

    HeldItem.VersionDetails.VersionDetail versionDetailXml = new VersionDetail();
    versionDetailXml.setRarity(versionDetail.getRarity());
    versionDetailXml.setVersion(version);

    return versionDetailXml;
  }


  private Moves convertJsonMovesToXml(List<MoveResource> moves) {

    Moves movesXml = new Moves();

    movesXml.getMoveResource().addAll(
        moves.stream().map(move -> this.convertMoveToXml(move)).collect(Collectors.toList()));

    return movesXml;
  }

  private com.pokeapi.soap.generation.MoveResource convertMoveToXml(MoveResource move) {
    com.pokeapi.soap.generation.MoveResource.VersionGroupDetails versioGroupDetailsXml =
        new VersionGroupDetails();
    versioGroupDetailsXml.getVersionGroupDetail()
        .addAll(move.getVersionGroup().stream()
            .map(versionGroup -> this.convertVersionGroupToXml(versionGroup))
            .collect(Collectors.toList()));

    com.pokeapi.soap.generation.MoveResource.Move moveResource = new Move();
    moveResource.setName(move.getMove().getName());
    moveResource.setUrl(move.getMove().getUrl());

    com.pokeapi.soap.generation.MoveResource moveResourceXml =
        new com.pokeapi.soap.generation.MoveResource();
    moveResourceXml.setMove(moveResource);
    moveResourceXml.setVersionGroupDetails(versioGroupDetailsXml);

    return moveResourceXml;
  }


  private com.pokeapi.soap.generation.MoveResource.VersionGroupDetails.VersionGroupDetail convertVersionGroupToXml(
      com.bankaya.soap.core.model.json.VersionGroupDetails versionGroup) {

    VersionGroupDetail.VersionGroup versionGroupXml = new VersionGroup();
    versionGroupXml.setName(versionGroup.getVersionGroup().getName());
    versionGroupXml.setUrl(versionGroup.getVersionGroup().getUrl());

    VersionGroupDetail.MoveLearnMethod methodLearnMethod = new MoveLearnMethod();
    methodLearnMethod.setName(versionGroup.getMoveLearnedMethod().getName());
    methodLearnMethod.setUrl(versionGroup.getMoveLearnedMethod().getUrl());

    VersionGroupDetail versionGroupDetailXml = new VersionGroupDetail();
    versionGroupDetailXml.setLevelLearnedAt(versionGroup.getLevelLearnedAt());
    versionGroupDetailXml.setMoveLearnMethod(methodLearnMethod);
    versionGroupDetailXml.setVersionGroup(versionGroupXml);

    return versionGroupDetailXml;
  }


  private Types convertJsonTypesToXml(List<TypeResource> types) {
    Types typesXml = new Types();
    typesXml.getTypeResource().addAll(
        types.stream().map(type -> this.convertTypeToXml(type)).collect(Collectors.toList()));

    return typesXml;
  }

  private com.pokeapi.soap.generation.TypeResource convertTypeToXml(TypeResource type) {
    com.pokeapi.soap.generation.TypeResource typeResourceXml =
        new com.pokeapi.soap.generation.TypeResource();
    typeResourceXml.setSlot(type.getSlot());

    com.pokeapi.soap.generation.TypeResource.Type typeXml = new Type();
    typeXml.setName(type.getType().getName());
    typeXml.setUrl(type.getType().getUrl());
    typeResourceXml.setType(typeXml);

    return typeResourceXml;
  }


  public Stats convertJsonStatsToXml(List<StatResource> stats) {
    Stats statsXml = new Stats();
    statsXml.getStatResource().addAll(
        stats.stream().map(stat -> this.convertStatToXml(stat)).collect(Collectors.toList()));

    return statsXml;
  }

  private com.pokeapi.soap.generation.StatResource convertStatToXml(StatResource stat) {
    com.pokeapi.soap.generation.StatResource statResourceXml =
        new com.pokeapi.soap.generation.StatResource();
    statResourceXml.setBaseStat(stat.getBaseStat());
    statResourceXml.setEffort(stat.getEffort());
    
    com.pokeapi.soap.generation.StatResource.Stat statXml = new Stat();
    statXml.setName(stat.getStat().getName());
    statXml.setUrl(stat.getStat().getUrl());
    
    statResourceXml.setStat(statXml);
    
    return statResourceXml;
  }


  public Sprites convertJsonSpritesToXml(SpriteResource sprites) {
    Sprites spritesXml = new Sprites();
    spritesXml.setBackDefault(sprites.getBackDefault());
    spritesXml.setBackFemale(sprites.getBackFemale());
    spritesXml.setBackShiny(sprites.getBackShiny());
    spritesXml.setBackShinyFemale(sprites.getBackShinyFemale());
    spritesXml.setFrontDefault(sprites.getFrontDefault());
    spritesXml.setFrontFemale(sprites.getFrontFemale());
    spritesXml.setFrontShiny(sprites.getFrontShiny());
    spritesXml.setFrontShinyFemale(sprites.getFrontShinyFemale());

    Sprites.Other otherXml = new Other();
    spritesXml.setOther(otherXml);

    Sprites.Versions versionsXml = new Versions();
    spritesXml.setVersions(versionsXml);

    return spritesXml;
  }

  public Species convertJsonSpeciesToXml(CommonItem species) {
    Species speciesXml = new Species();
    speciesXml.setName(species.getName());
    speciesXml.setUrl(species.getUrl());

    return speciesXml;
  }
}
