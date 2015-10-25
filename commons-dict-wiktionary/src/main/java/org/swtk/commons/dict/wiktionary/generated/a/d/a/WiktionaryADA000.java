package org.swtk.commons.dict.wiktionary.generated.a.d.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryADA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("adactylism", "{\"term\":\"adactylism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The congenital absence of fingers or toes\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adactyly", "{\"term\":\"adactyly\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|a|dactyly|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Congenital absence of the digits\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adage", "{\"term\":\"adage\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\", \"Latin\"], \"text\":\"From French \u0027adage\u0027 from Latin \u0027adagium\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An old saying which has obtained credit by long us\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An old saying which has been overused or considered a cliché; a trite maxi\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"“Like the poor cat i’ th’ \u0027\u0027adage\u0027\u0027” (Lady MacBeth\", \"priority\":3}]}, \"synonyms\":{}}");

	add("adalimumab", "{\"term\":\"adalimumab\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An antirheumatic drug used to treat rheumatoid arthritis\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adamance", "{\"term\":\"adamance\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being adamant\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adamite", "{\"term\":\"adamite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Adam|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One of a sect of visionaries, who, professing to imitate the state of the Biblical Adam, discarded the use of clothing in their assemblies\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adamsite", "{\"term\":\"adamsite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Named after w:Roger Adams|Roger Adams, an American organic chemist.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An organic compound, diphenylaminechlorarsine, used as a riot-control agent\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adapalene", "{\"term\":\"adapalene\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular medicine used topically to treat skin conditions\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adaptability", "{\"term\":\"adaptability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|adaptable|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being adaptable; a quality that renders adaptable\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Variability in respect to, or under the influence of, external conditions; susceptibility of an organism to that variation whereby it becomes suited to or fitted for its conditions of environment; the capacity of an organism to be modified by circumstances\", \"priority\":2}]}, \"synonyms\":{}}");

	add("adaptableness", "{\"term\":\"adaptableness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being adaptable; adaptability\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adaptationism", "{\"term\":\"adaptationism\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The view that many traits of organisms are evolved adaptations\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A set of methods for distinguishing traits resulting from adaptation from those arising through other processes\", \"priority\":2}]}, \"synonyms\":{}}");

	add("adaptedness", "{\"term\":\"adaptedness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|adapted|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being adapted; suitableness; fitness\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The result of being adapted\", \"priority\":2}]}, \"synonyms\":{}}");

	add("adaptitude", "{\"term\":\"adaptitude\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Circa 1800 {{suffix|adapt|itude|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Adaptedness; special aptitude\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adaptiveness", "{\"term\":\"adaptiveness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|adaptive|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being adaptive; capacity to adapt\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adaptivity", "{\"term\":\"adaptivity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|adaptive|ity|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or quality of being adaptive; capacity to adapt\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adaptness", "{\"term\":\"adaptness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state of being fitted; adaptation; aptness; as, adaptness of the sound to the sense\", \"priority\":1}]}, \"synonyms\":{}}");

	add("adaptometry", "{\"term\":\"adaptometry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The measurement of threshold of brightness by means of an adaptometer\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }