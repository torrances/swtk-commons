package org.swtk.commons.dict.wordnet.index.name.instance.b.o.r.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBORO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"borodin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10877929\"]}");
	add("{\"term\":\"borodino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01274627\"]}");
	add("{\"term\":\"boron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14656049\"]}");
	add("{\"term\":\"borosilicate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14808357\"]}");
	add("{\"term\":\"borough\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08557579\", \"08558095\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }