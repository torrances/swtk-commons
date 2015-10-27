package org.swtk.commons.dict.wordnet.index.name.instance.s.q.u.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSQUE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"squeak\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00061834\", \"07410223\"]}");
	add("{\"term\":\"squeaker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00061834\", \"04299871\"]}");
	add("{\"term\":\"squeal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07410377\"]}");
	add("{\"term\":\"squealer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02398058\", \"10225792\"]}");
	add("{\"term\":\"squeamishness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04904329\", \"14383725\"]}");
	add("{\"term\":\"squeegee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04300059\"]}");
	add("{\"term\":\"squeezability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04945651\"]}");
	add("{\"term\":\"squeeze\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"00227186\", \"00418872\", \"00789758\", \"07365631\", \"10663023\", \"13348525\", \"14512496\", \"00357849\"]}");
	add("{\"term\":\"squeezer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04300257\"]}");
	add("{\"term\":\"squeezing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00357849\"]}");
	add("{\"term\":\"squelch\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04300396\", \"06729735\"]}");
	add("{\"term\":\"squelcher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04300396\", \"06729735\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }