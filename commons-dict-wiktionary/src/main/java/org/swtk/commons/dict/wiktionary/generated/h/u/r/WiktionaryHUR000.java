package org.swtk.commons.dict.wiktionary.generated.h.u.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHUR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hurdle", "{\"term\":\"hurdle\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"From Old english (ca. 450-1100) \u0027hyrdel\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An artificial barrier, variously constructed, over which athletes or horses jump in a race\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A perceived obstacle\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A movable frame of wattled twigs, osiers, or withes and stakes, or sometimes of iron, used for enclosing land, for folding sheep and cattle, for gates, etc.; also, in fortification, used as revetments, and for other purposes\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1882\u0027\u0027, James Edwin Thorold Rogers, \u0027A History of Agriculture and Prices in England\u0027, Volume 4, p. 414\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The practice of folding sheep was general, and the purchase of \u0027\u0027hurdles\u0027\u0027 was a regular charge in the shepherd\u0027s account\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A sled or crate on which criminals were formerly drawn to the place of execution\", \"priority\":6}]}, \"synonyms\":{}}");

	add("hurlbutite", "{\"term\":\"hurlbutite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027-ite\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A monoclinic-prismatic mineral containing beryllium, calcium, oxygen, and phosphorus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hurry", "{\"term\":\"hurry\", \"etymology\":{\"influencers\":[{},{},{}], \"languages\":[\"Welsh\", \"English\", \"middle english (1100-1500)\", \"middle high german (ca. 1050-1500)\", \"Latin\", \"Lithuanian\", \"Norwegian\"], \"text\":\"From Middle english (1100-1500) \u0027horien\u0027 (to rush, impel) probably a variation of Middle english (1100-1500) \u0027hurren\u0027 (to vibrate rapidly, buzz) from Proto-germanic {{m|gem-pro|*hurzaną||to rush}} (compare Middle high german (ca. 1050-1500) \u0027hurren\u0027 (to hasten) Norwegian \u0027hurre\u0027 (to whirl around) , from Proto-indo-european {{m|ine-pro|*ḱers-}}, {{m|ine-pro|*ḱors-||to run, hurry}} (compare Welsh \u0027carrog\u0027 (torrent) Latin \u0027currō\u0027 (i run) Tocharian A/B \u0027kursär\u0027 \u0027kwärsar\u0027 (league; course) Lithuanian {{m|lt|karsiù||to go quickly}}). Related to {{m|en|hurr}}, {{m|en|horse}}, {{m|en|rush}}.Alternative etymology derives \u0027hurry\u0027 as a variant of \u0027harry\u0027 () which see.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Rushed action\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Urgency\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"In American football, an incidence of a defensive player forcing the quarterback to act faster than the quarterback was prepared to, resulting in a failed offensive play\", \"priority\":3}]}, \"synonyms\":{}}");

	add("hurrian", "{\"term\":\"hurrian\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"member of an ancient people who lived in northern Mesopotamia; they created a powerful kingdom called Mitanni in the 16-13th century BC\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hurrier", "{\"term\":\"hurrier\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{-er|hurry}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who hurries\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A young boy or girl employed in a coal mine to drag baskets or small wagons full of coal from the coal face where it was mined, up to the surface\", \"priority\":2}]}, \"synonyms\":{}}");

	add("hurtfulness", "{\"term\":\"hurtfulness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hurtful|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The property of being hurtful\", \"priority\":1}]}, \"synonyms\":{}}");

	add("hurtlessness", "{\"term\":\"hurtlessness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|hurtless|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being hurtless\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }