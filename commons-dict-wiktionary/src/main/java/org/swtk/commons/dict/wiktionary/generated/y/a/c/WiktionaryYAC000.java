package org.swtk.commons.dict.wiktionary.generated.y.a.c;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryYAC000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("yacht", "{\"term\":\"yacht\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Dutch\"], \"text\":\"Circa 1557; variant of \u0027\u0027 earlier {{m|enm|yeaghe||light, fast-sailing ship}}, from Dutch {{m|nl|jacht||hunt}}, in older spelling {{m|nl|jaghte|jaght(e)}}, short for {{m|nl|jaghtschip}}, {{m|nl|jageschip||light sailing vessel, fast pirate ship}}, literally, \u0026quot;pursuit ship\u0026quot;, compound of {{m|nl|jagen||to hunt, chase}} and {{m|nl|schip||ship}} (see ship), from Proto-germanic {{m|gem-pro|*jagōną}} (compare West Frisian {{m|fy|jeie}}, German {{m|de|jagen}}, Swedish {{m|sv|jaga}}), from Proto-indo-european {{m|ine-pro|*yegʰo-}} (compare Irish {{m|ga|éad||jealousy}}, Russian {{m|ru|я́рый||furious}}, Albanian {{m|sq|gjah||hunt}}, Ancient Greek {{m|grc|ζητέω||to search, seek}}, Sanskrit {{m|sa|यवन|tr\u003dyāvana||barbarian; agressor}}, {{m|sa|यत्न||zeal|tr\u003dyātna}}).In the 16th century the Dutch built light, fast ships to chase the ships of pirates and smugglers from the coast. The ship was introduced to England in 1660 when the Dutch East India Company presented one to King Charles II, who used it as a pleasure boat, after which it was copied by British shipbuilders as a pleasure craft for wealthy gentlemen.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A slick and light ship for making pleasure trips or racing on water, having sails but often motor-powered. At times used as a residence offshore on a dock\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"chapter\u003d10|passage\u003dThe skipper Mr. Cooke had hired at Far Harbor was a God-fearing man with a luke warm interest in his new billet and employer, and had only been prevailed upon to take charge of the \u0027\u0027yacht\u0027\u0027 after the offer of an emolument equal to half a year\u0027s sea pay of an ensign in the navy\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any vessel used for private, noncommercial purposes\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"“I don’t mean all of your friends—only a small proportion—which, however, connects your circle with that deadly, idle, brainless bunch—the insolent chatterers at the opera,, the chlorotic squatters on huge \u0027\u0027yachts\u0027\u0027,, the neurotic victims of mental cirrhosis, the jewelled animals whose moral code is the code of the barnyard—!\u0026quot\", \"priority\":4}]}, \"synonyms\":{}}");

	add("yachter", "{\"term\":\"yachter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who sails in yachts\", \"priority\":1}]}, \"synonyms\":{}}");

	add("yachtsmanship", "{\"term\":\"yachtsmanship\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|yachtsman|ship|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The ability or art of being adept at sailing a yacht\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }