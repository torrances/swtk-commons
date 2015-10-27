package org.swtk.commons.dict.wordnet.index.name.instance.s.q.u.a;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSQUA {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"squab\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01817190\", \"04298013\", \"07662012\"]}");
	add("{\"term\":\"squabble\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07199395\"]}");
	add("{\"term\":\"squabbler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10661897\"]}");
	add("{\"term\":\"squad\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08097824\", \"08225481\", \"08235043\"]}");
	add("{\"term\":\"squadron\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"08237149\", \"08236689\", \"08237010\"]}");
	add("{\"term\":\"squalidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01496007\"]}");
	add("{\"term\":\"squalidness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14522695\"]}");
	add("{\"term\":\"squall\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11534441\"]}");
	add("{\"term\":\"squalor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14522695\"]}");
	add("{\"term\":\"squalus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01496328\"]}");
	add("{\"term\":\"squama\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01905875\"]}");
	add("{\"term\":\"squamata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01676144\"]}");
	add("{\"term\":\"squamule\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13176694\"]}");
	add("{\"term\":\"squanderer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10499146\"]}");
	add("{\"term\":\"squandering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00745120\"]}");
	add("{\"term\":\"squandermania\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00745302\"]}");
	add("{\"term\":\"square\", \"synsetCount\":8, \"upperType\":\"NOUN\", \"ids\":[\"04298380\", \"04298649\", \"10662243\", \"10662386\", \"13901590\", \"08637195\", \"13753131\", \"13901273\"]}");
	add("{\"term\":\"squareness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05079575\"]}");
	add("{\"term\":\"squaretail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02637488\"]}");
	add("{\"term\":\"squark\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09471066\"]}");
	add("{\"term\":\"squash\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00480898\", \"07731306\", \"12179315\"]}");
	add("{\"term\":\"squat\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00345768\", \"13795187\", \"00631311\"]}");
	add("{\"term\":\"squatina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01497981\"]}");
	add("{\"term\":\"squatinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01497833\"]}");
	add("{\"term\":\"squatness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05145043\"]}");
	add("{\"term\":\"squatter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10662493\", \"10662616\"]}");
	add("{\"term\":\"squattiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05005981\"]}");
	add("{\"term\":\"squatting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00345768\", \"00631311\"]}");
	add("{\"term\":\"squaw\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10662798\"]}");
	add("{\"term\":\"squawbush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12785267\"]}");
	add("{\"term\":\"squawk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07224625\", \"07410046\"]}");
	add("{\"term\":\"squawker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04299710\", \"10796007\"]}");
	add("{\"term\":\"squawroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11719031\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }