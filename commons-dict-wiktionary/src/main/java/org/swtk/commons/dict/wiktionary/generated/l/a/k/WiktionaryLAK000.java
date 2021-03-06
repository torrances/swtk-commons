package org.swtk.commons.dict.wiktionary.generated.l.a.k;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryLAK000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("lakebed", "{\"term\":\"lakebed\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{compound|lake|bed|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The bottom of a lake, especially after the lake has gone dry\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lakeshore", "{\"term\":\"lakeshore\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|lake|shore|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The shore of a lake\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lakeside", "{\"term\":\"lakeside\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|lake|side|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The ground near the edge of a lake, the land adjacent to a lake\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lakin", "{\"term\":\"lakin\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old norse\"], \"text\":\"Perhaps from Old norse leika.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"1922\u0027\u0027: And the gay \u0027\u0027lakin\u0027\u0027, mistress Fitton, mount and cry O, and his dainty birdsnies, lady Penelope Rich, a clean quality woman is suited for a player, and the punks of the bankside, a penny a time. — James Joyce, \u0027Ulysses\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lakist", "{\"term\":\"lakist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|lake|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A member of the , a group of English Romantic poets from the Lake District\", \"priority\":1}]}, \"synonyms\":{}}");

	add("lakota", "{\"term\":\"lakota\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Lakota for \u0026quot;alliance of friends\u0026quot;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Native American tribe, also known as the Sioux, now living primarily on the Rosebud, Pine Ridge, Lower Brule, Standing Rock and Cheyenne River Reservations\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The language spoken by the Lakota\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }