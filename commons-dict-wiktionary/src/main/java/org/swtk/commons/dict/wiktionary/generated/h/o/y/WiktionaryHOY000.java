package org.swtk.commons.dict.wiktionary.generated.h.o.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryHOY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("hoyden", "{\"term\":\"hoyden\", \"etymology\":{\"influencers\":[], \"languages\":[\"middle dutch (ca. 1050-1350)\", \"English\"], \"text\":\"Probably from Middle dutch (ca. 1050-1350) \u0027heyden\u0027 \u0027heidin\u0027 (Modern Dutch \u0027heiden\u0027 , from Germanic heidano ‘heathen, gypsy’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A rude, uncultured or rowdy girl or woman\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1857\u0027\u0027, \u0027w:Barchester Barchester Towers: In Three Volumes\u0027, London: Longman, Brown, Green, Longmans \u0026amp; Roberts, [http://www.worldcat.org/oclc/911659634 911659634]; republished [London]: D. Campbell Publishers, 1992 (; 57), ISBN 978-1-85715-057-5, volume II, page 147\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"She is a \u0027\u0027hoyden\u0027\u0027, one will say. At any rate she is not a lady, another will exclaim. I have suspected her all through, a third will declare; she has no idea of the dignity of a matron; or of the peculiar propriety which her position demands\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1897\u0027\u0027, Henry James, \u0027What Maisie Knew\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"her ladyship burst suddenly into the schoolroom to introduce Mr. Perriam, who, as she announced from the doorway to Maisie, wouldn\u0027t believe his ears that one had a great \u0027\u0027hoyden\u0027\u0027 of a daughter\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"1985\u0027\u0027, John Fowles, \u0027A Maggot\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Not all ladies in my profession are as that shameless \u0027\u0027hoyden\u0027\u0027, Mrs Charke, that has brought such distress through her malicious conduct and ill repute upon her worthy father, Mr Cibber; far from it, sir\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"1997\u0027\u0027, Andrew Miller, \u0027Ingenious Pain\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"Tabitha is lighting the candles in the sconces. A great, strong, heavy girl, a \u0027\u0027hoyden\u0027\u0027, not pretty, her face distinguished only by youth, by health\", \"priority\":9}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }