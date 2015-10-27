package org.swtk.commons.dict.wordnet.index.name.instance.b.e.n.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceBENT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"bent\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"05632037\", \"08588062\", \"12127303\", \"06209437\"]}");
	add("{\"term\":\"bentham\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10865199\"]}");
	add("{\"term\":\"benthos\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00005787\", \"08596045\"]}");
	add("{\"term\":\"benton\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10865359\", \"10865522\"]}");
	add("{\"term\":\"bentonite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14837879\"]}");
	add("{\"term\":\"bentwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02833614\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }