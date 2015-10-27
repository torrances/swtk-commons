package org.swtk.commons.dict.wordnet.index.name.instance.s.i.n.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSINK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sink\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03002170\", \"09458643\", \"13577118\", \"04230655\"]}");
	add("{\"term\":\"sinker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00109785\", \"04230853\", \"07654678\"]}");
	add("{\"term\":\"sinkhole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09458643\"]}");
	add("{\"term\":\"sinkiang\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08747459\"]}");
	add("{\"term\":\"sinking\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07540606\", \"07370866\", \"07378483\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }