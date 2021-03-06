package org.swtk.commons.dict.wordnet.indexbyname.instance.n.o.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceNOC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"noc\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10379358\"]}");
	add("{\"term\":\"noctambulation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00285985\"]}");
	add("{\"term\":\"noctambulism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00285985\"]}");
	add("{\"term\":\"noctambulist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10630877\"]}");
	add("{\"term\":\"noctiluca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01420315\"]}");
	add("{\"term\":\"noctiluca miliaris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01420315\"]}");
	add("{\"term\":\"noctua\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02298222\"]}");
	add("{\"term\":\"noctuid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02297716\"]}");
	add("{\"term\":\"noctuid moth\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02297716\"]}");
	add("{\"term\":\"noctuidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02297413\"]}");
	add("{\"term\":\"nocturia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13543688\"]}");
	add("{\"term\":\"nocturnal emission\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13543814\"]}");
	add("{\"term\":\"nocturne\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07061737\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }