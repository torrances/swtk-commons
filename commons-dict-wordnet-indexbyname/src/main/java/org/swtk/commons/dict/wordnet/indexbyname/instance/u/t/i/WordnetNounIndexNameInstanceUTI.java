package org.swtk.commons.dict.wordnet.indexbyname.instance.u.t.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceUTI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"utica\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08939980\", \"09148295\"]}");
	add("{\"term\":\"utilisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00948944\"]}");
	add("{\"term\":\"utiliser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10762781\"]}");
	add("{\"term\":\"utilitarian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10762393\"]}");
	add("{\"term\":\"utilitarianism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06197264\"]}");
	add("{\"term\":\"utility\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"04524169\", \"06593586\", \"13601261\", \"00580371\", \"05155946\", \"08202676\"]}");
	add("{\"term\":\"utility bond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13361917\"]}");
	add("{\"term\":\"utility man\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10762538\", \"10762654\"]}");
	add("{\"term\":\"utility program\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06593586\"]}");
	add("{\"term\":\"utility revenue bond\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13361917\"]}");
	add("{\"term\":\"utility routine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06596878\"]}");
	add("{\"term\":\"utilization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14604021\", \"00948944\"]}");
	add("{\"term\":\"utilizer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10762781\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }