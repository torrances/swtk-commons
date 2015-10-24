package org.swtk.commons.dict.wiktionary.generated.v.i.g;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryVIG000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("viga", "{\"term\":\"viga\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From Spanish \u0027vig. Spanish|viga\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a roughly made rafter or roof timber, especially in a Latin American villag\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1992\u0027\u0027: The \u0027\u0027vigas\u0027\u0027 were partly down and hunters or herdsmen had built fires in the floor. — Cormac McCarthy, \u0027All The Pretty Horses\", \"priority\":2}]}, \"synonyms\":{}}");

	add("vigil", "{\"term\":\"vigil\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"Middle english (1100-1500) \u0027vigile|lang\u003denm\u0027 () from Old french (842-ca. 1400) \u0027vigile\u0027 from Latin \u0027vigilia\u0027 (wakefulness, watch) from \u0027vigil\u0027 (awake) from Proto-indo-european {{m|ine-pro|*weǵ-||to be strong}}.Related to \u0027vigor\u0027 and more distantly compare \u0027vis\u0027 and \u0027vital\u0027 from similar Proto-Indo-European roots and meanings (lively, power, life), via Latin. For use of “live, alive” in sense “watching”, compare \u0027qui vive\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An instance of keeping awake during normal sleeping hours, especially to keep watch or pray\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A period of observation or surveillance at any hour\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"His dog kept \u0027\u0027vigil\u0027\u0027 outside the hospital for eight days while he was recovering from an accident\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The eve of a religious festival in which staying awake is part of the ritual devotions\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A quiet demonstration in support of a cause\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The protesters kept \u0027\u0027vigil\u0027\u0027 outside the conference centre in which the party congress was being held\", \"priority\":6}]}, \"synonyms\":{}}");

	add("vigilance", "{\"term\":\"vigilance\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027vigilance\u0027 from Latin \u0027vigilantia\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Alert watchfulness\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d8|passage\u003dI corralled the judge, and we started off across the fields, in no very mild state of fear of that gentleman\u0027s wife, whose \u0027\u0027vigilance\u0027\u0027 was seldom relaxed. And thus we came by a circuitous route to Mohair, the judge occupied by his own guilty thoughts, and I by others not less disturbing\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Close and continuous attention\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1837\u0027\u0027 March 4, \u0027Farewell Address\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"But you must remember, my fellow-citizens, that eternal \u0027\u0027vigilance\u0027\u0027 by the people is the price of liberty, and that you must pay the price if you wish to secure the blessing\", \"priority\":5}]}, \"synonyms\":{}}");

	add("vigilante", "{\"term\":\"vigilante\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Spanish\", \"Latin\"], \"text\":\"From Spanish \u0027vigilante\u0027 (lang\u003des) from Latin \u0027vigilans\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who considers it their own responsibility to uphold the law in their neighborhood and often does so summarily and without legal jurisdiction\", \"priority\":1}]}, \"synonyms\":{}}");

	add("vigneron", "{\"term\":\"vigneron\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{borrowing|fr|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who grows vines for wine production\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A labourer in a vineyard\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }