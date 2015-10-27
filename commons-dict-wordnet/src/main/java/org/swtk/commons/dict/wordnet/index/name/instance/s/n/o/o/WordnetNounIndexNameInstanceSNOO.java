package org.swtk.commons.dict.wordnet.index.name.instance.s.n.o.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSNOO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"snood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04257802\"]}");
	add("{\"term\":\"snook\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02562741\"]}");
	add("{\"term\":\"snooker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00502315\"]}");
	add("{\"term\":\"snoop\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10636709\"]}");
	add("{\"term\":\"snooper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10636709\"]}");
	add("{\"term\":\"snoopiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05691195\"]}");
	add("{\"term\":\"snoopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09628042\"]}");
	add("{\"term\":\"snoot\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05606462\", \"10636540\"]}");
	add("{\"term\":\"snootiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05222119\"]}");
	add("{\"term\":\"snooze\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00860015\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }