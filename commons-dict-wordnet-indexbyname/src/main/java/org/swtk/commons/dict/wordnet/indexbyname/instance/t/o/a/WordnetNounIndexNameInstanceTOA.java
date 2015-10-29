package org.swtk.commons.dict.wordnet.indexbyname.instance.t.o.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTOA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"toad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01642406\"]}");
	add("{\"term\":\"toad frog\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01642406\"]}");
	add("{\"term\":\"toad lily\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11882110\"]}");
	add("{\"term\":\"toad rush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11764577\"]}");
	add("{\"term\":\"toadfish\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02551320\"]}");
	add("{\"term\":\"toadflax\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12905020\"]}");
	add("{\"term\":\"toadshade\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12489662\"]}");
	add("{\"term\":\"toadstool\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13021966\"]}");
	add("{\"term\":\"toady\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10704310\"]}");
	add("{\"term\":\"toast\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07900388\", \"10157456\", \"10733016\", \"07702618\"]}");
	add("{\"term\":\"toast mistress\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10733492\"]}");
	add("{\"term\":\"toaster\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04449446\", \"10733151\"]}");
	add("{\"term\":\"toaster oven\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04449575\"]}");
	add("{\"term\":\"toasting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00247419\"]}");
	add("{\"term\":\"toasting fork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04449716\"]}");
	add("{\"term\":\"toastmaster\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10733335\"]}");
	add("{\"term\":\"toastrack\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04449875\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }