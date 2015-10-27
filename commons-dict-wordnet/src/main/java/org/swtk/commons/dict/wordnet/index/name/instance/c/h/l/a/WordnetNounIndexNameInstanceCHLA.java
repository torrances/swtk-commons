package org.swtk.commons.dict.wordnet.index.name.instance.c.h.l.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCHLA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"chlamydera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01603909\"]}");
	add("{\"term\":\"chlamydia\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01375350\", \"14199061\"]}");
	add("{\"term\":\"chlamydiaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01375013\"]}");
	add("{\"term\":\"chlamydomonadaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01412118\"]}");
	add("{\"term\":\"chlamydomonas\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01412306\"]}");
	add("{\"term\":\"chlamydosaurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01690747\"]}");
	add("{\"term\":\"chlamydospore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11569321\"]}");
	add("{\"term\":\"chlamyphore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02458906\"]}");
	add("{\"term\":\"chlamyphorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02458778\"]}");
	add("{\"term\":\"chlamys\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03024911\", \"11712734\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }