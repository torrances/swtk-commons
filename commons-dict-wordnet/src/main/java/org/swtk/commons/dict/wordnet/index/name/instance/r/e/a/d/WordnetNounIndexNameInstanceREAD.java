package org.swtk.commons.dict.wordnet.index.name.instance.r.e.a.d;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREAD {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"read\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06602346\"]}");
	add("{\"term\":\"readability\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04826516\", \"04827184\"]}");
	add("{\"term\":\"reader\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"06426704\", \"10271919\", \"10272051\", \"10502353\", \"10546502\", \"10528455\", \"10689922\", \"10528303\"]}");
	add("{\"term\":\"readership\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08239492\"]}");
	add("{\"term\":\"readiness\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"04716072\", \"05682428\", \"04652076\", \"14054590\"]}");
	add("{\"term\":\"reading\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"01006524\", \"07249541\", \"08900450\", \"05937299\", \"06610383\", \"05824916\", \"07188417\", \"05816802\"]}");
	add("{\"term\":\"readjustment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01001729\", \"00194976\"]}");
	add("{\"term\":\"readmission\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01250965\"]}");
	add("{\"term\":\"readout\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04065706\", \"06832564\", \"07279857\"]}");
	add("{\"term\":\"ready\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14055005\"]}");
	add("{\"term\":\"readying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01145325\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }