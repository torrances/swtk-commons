package org.swtk.commons.dict.wordnet.index.name.instance.d.e.p.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDEPI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"depicting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05774981\"]}");
	add("{\"term\":\"depiction\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00902424\", \"03178190\", \"05774981\", \"07216464\"]}");
	add("{\"term\":\"depigmentation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04983954\"]}");
	add("{\"term\":\"depilation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00255464\", \"14480666\"]}");
	add("{\"term\":\"depilator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03181831\"]}");
	add("{\"term\":\"depilatory\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03181831\", \"14857899\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }