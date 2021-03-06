package org.swtk.commons.dict.wordnet.indexbyname.instance.h.o.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHOS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hosanna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07137347\"]}");
	add("{\"term\":\"hose\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03545055\", \"03545270\", \"03545447\"]}");
	add("{\"term\":\"hosea\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06450923\", \"11081220\"]}");
	add("{\"term\":\"hosepipe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03545055\"]}");
	add("{\"term\":\"hosier\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10206197\"]}");
	add("{\"term\":\"hosiery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03545447\"]}");
	add("{\"term\":\"hosni mubarak\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11214577\"]}");
	add("{\"term\":\"hospice\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00698502\", \"03545656\"]}");
	add("{\"term\":\"hospitableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04663639\"]}");
	add("{\"term\":\"hospital\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08071169\", \"03545775\"]}");
	add("{\"term\":\"hospital attendant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10401503\"]}");
	add("{\"term\":\"hospital bed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03546094\"]}");
	add("{\"term\":\"hospital care\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00659870\"]}");
	add("{\"term\":\"hospital chaplain\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10206305\"]}");
	add("{\"term\":\"hospital occupancy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13840948\"]}");
	add("{\"term\":\"hospital room\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03546271\"]}");
	add("{\"term\":\"hospital ship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03546449\"]}");
	add("{\"term\":\"hospital train\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03546573\"]}");
	add("{\"term\":\"hospital ward\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04557205\"]}");
	add("{\"term\":\"hospitalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00659870\"]}");
	add("{\"term\":\"hospitality\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06644013\"]}");
	add("{\"term\":\"hospitalization\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00659870\", \"13367927\", \"14599598\", \"15144127\"]}");
	add("{\"term\":\"hospitalization insurance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13367927\"]}");
	add("{\"term\":\"host\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"04182208\", \"07698883\", \"10206393\", \"10206975\", \"08498195\", \"08200720\", \"10318917\", \"01388168\", \"08199880\", \"10206749\"]}");
	add("{\"term\":\"hosta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12478024\"]}");
	add("{\"term\":\"hostaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12477755\"]}");
	add("{\"term\":\"hostage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10207176\"]}");
	add("{\"term\":\"hostel\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03546717\", \"03546876\"]}");
	add("{\"term\":\"hosteller\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10206569\", \"10207609\"]}");
	add("{\"term\":\"hostelry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03546876\"]}");
	add("{\"term\":\"hostess\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10675314\", \"10206678\", \"10207110\"]}");
	add("{\"term\":\"hostile\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08414632\"]}");
	add("{\"term\":\"hostile expedition\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00970583\"]}");
	add("{\"term\":\"hostile fire\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00993156\"]}");
	add("{\"term\":\"hostile takeover\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00792478\"]}");
	add("{\"term\":\"hostile witness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09793105\"]}");
	add("{\"term\":\"hostilities\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00966892\"]}");
	add("{\"term\":\"hostility\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"00966680\", \"07563271\", \"14003773\", \"04665463\"]}");
	add("{\"term\":\"hostler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10663740\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }