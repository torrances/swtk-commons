package org.swtk.commons.dict.wordnet.index.name.instance.c.u.r.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCURA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"curability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04863952\"]}");
	add("{\"term\":\"curableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04863952\"]}");
	add("{\"term\":\"curacao\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07926194\", \"08766875\"]}");
	add("{\"term\":\"curacoa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07926194\"]}");
	add("{\"term\":\"curacy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00592561\"]}");
	add("{\"term\":\"curandera\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10002844\"]}");
	add("{\"term\":\"curandero\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10002974\"]}");
	add("{\"term\":\"curare\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15136176\"]}");
	add("{\"term\":\"curassow\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01802320\"]}");
	add("{\"term\":\"curate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10003102\"]}");
	add("{\"term\":\"curative\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04081594\"]}");
	add("{\"term\":\"curator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10003419\"]}");
	add("{\"term\":\"curatorship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00592638\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }