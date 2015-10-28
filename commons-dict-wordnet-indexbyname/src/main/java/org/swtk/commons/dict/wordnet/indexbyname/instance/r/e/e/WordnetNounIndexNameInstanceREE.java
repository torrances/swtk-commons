package org.swtk.commons.dict.wordnet.indexbyname.instance.r.e.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"reed\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02820934\", \"04074000\", \"11276325\", \"11276484\", \"12157237\"]}");
	add("{\"term\":\"reedbird\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01568240\", \"01576539\"]}");
	add("{\"term\":\"reedmace\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12176290\"]}");
	add("{\"term\":\"reef\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03463893\", \"09024251\", \"09429671\"]}");
	add("{\"term\":\"reefer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03606019\"]}");
	add("{\"term\":\"reek\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05722841\"]}");
	add("{\"term\":\"reel\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00540711\", \"00541248\", \"02863755\", \"04074584\", \"07070720\", \"04074770\"]}");
	add("{\"term\":\"reelection\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00182222\"]}");
	add("{\"term\":\"reeler\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10533644\", \"10665293\"]}");
	add("{\"term\":\"reenactment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00552950\"]}");
	add("{\"term\":\"reenactor\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10533714\"]}");
	add("{\"term\":\"reenforcement\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00973567\", \"06662983\"]}");
	add("{\"term\":\"reenlistment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01209598\"]}");
	add("{\"term\":\"reentry\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00329056\"]}");
	add("{\"term\":\"reevaluation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05744970\"]}");
	add("{\"term\":\"reeve\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02032878\"]}");
	add("{\"term\":\"reexamination\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00144071\", \"07210064\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }