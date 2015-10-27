package org.swtk.commons.dict.wordnet.index.name.instance.m.a.i.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMAIN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"main\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03716684\", \"09368829\"]}");
	add("{\"term\":\"maine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09115069\"]}");
	add("{\"term\":\"mainer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09762818\"]}");
	add("{\"term\":\"mainframe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02998952\", \"03717250\"]}");
	add("{\"term\":\"mainland\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09369017\"]}");
	add("{\"term\":\"mainmast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03717538\"]}");
	add("{\"term\":\"mainsail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03717876\"]}");
	add("{\"term\":\"mainsheet\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04195411\"]}");
	add("{\"term\":\"mainspring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03717983\"]}");
	add("{\"term\":\"mainstay\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03718176\", \"05702197\", \"10452721\"]}");
	add("{\"term\":\"mainstream\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05964053\"]}");
	add("{\"term\":\"maintainer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10759876\"]}");
	add("{\"term\":\"maintenance\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00767144\", \"01218681\", \"13304643\", \"13387484\", \"00268366\"]}");
	add("{\"term\":\"maintenon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11170214\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }