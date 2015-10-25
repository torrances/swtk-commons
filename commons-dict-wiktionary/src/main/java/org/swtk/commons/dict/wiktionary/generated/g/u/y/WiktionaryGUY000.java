package org.swtk.commons.dict.wiktionary.generated.g.u.y;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryGUY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("guys", "{\"term\":\"guys\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Persons, irrespective of their genders\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Who are those \u0027\u0027guys\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A form of address for a group of male persons or a group of mixed male and female persons\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Hi \u0027\u0027guys\", \"priority\":4}]}, \"synonyms\":{}}");

	add("guyana", "{\"term\":\"guyana\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A country in South America. Official name: Co-operative Republic of Guyana\", \"priority\":1}]}, \"synonyms\":{}}");

	add("guyanese", "{\"term\":\"guyanese\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|Guyana|ese|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person from Guyana or of Guyanese descent\", \"priority\":1}]}, \"synonyms\":{}}");

	add("guyness", "{\"term\":\"guyness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|guy|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"State of being a gu\", \"priority\":1}]}, \"synonyms\":{}}");

	add("guyot", "{\"term\":\"guyot\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Named for Swiss geologist {{w|Arnold Henry Guyot}} (1807-1884); coined by {{w|Harry Hammond Hess}} circa 1965.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A flat-topped seamount\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2003\u0027\u0027, \u0027A Short History of Nearly Everything\u0027, BCA, page 158\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"It was scored everywhere with canyons, trenches and crevasses and dotted with volcanic seamounts that he called \u0027\u0027guyots\u0027\u0027 after an earlier Princeton geologist named Arnold Guyot\", \"priority\":3}]}, \"synonyms\":{}}");

	add("guyver", "{\"term\":\"guyver\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Origin unknown.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Flattering talk; behaviour put on to impress or deceive; persiflage.\u0026lt;ref\u0026gt;\u0027\u0027[http://books.google.com.au/books?id\u003dB7tZAAAAMAAJ\u0026amp;q\u003d%22guyver%22+-intitle:%22%22+-inauthor:%22%22\u0026amp;dq\u003d%22guyver%22+-intitle:%22%22+-inauthor:%22%22\u0026amp;hl\u003den\u0026amp;sa\u003dX\u0026amp;ei\u003dJ3JwT-mqCMShiAe7gdHmBQ\u0026amp;redir_esc\u003dy guyver]\u0027\u0027, entry in \u0027\u00271989\u0027\u0027, Joan Hughes, \u0027Australian Words and Their Origins\u0027, page 249.\u0026lt;/ref\u0026gt\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }