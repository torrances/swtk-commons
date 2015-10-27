package org.swtk.commons.dict.wordnet.index.name.instance.t.a.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTARA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08910011\"]}");
	add("{\"term\":\"tarabulus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08977766\"]}");
	add("{\"term\":\"taracahitian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09689985\"]}");
	add("{\"term\":\"taradiddle\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06623500\", \"06769768\"]}");
	add("{\"term\":\"tarahumara\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09690226\"]}");
	add("{\"term\":\"taraktagenos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12399795\"]}");
	add("{\"term\":\"taraktogenos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12399795\"]}");
	add("{\"term\":\"tarantella\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00534842\", \"07071988\"]}");
	add("{\"term\":\"tarantelle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00534842\"]}");
	add("{\"term\":\"tarantino\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11351295\"]}");
	add("{\"term\":\"tarantism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14119224\"]}");
	add("{\"term\":\"tarantula\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01777391\", \"01778011\"]}");
	add("{\"term\":\"tarawa\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01299188\", \"08859956\"]}");
	add("{\"term\":\"taraxacum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12044465\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }