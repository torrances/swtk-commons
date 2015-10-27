package org.swtk.commons.dict.wordnet.index.name.instance.d.r.a.w;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDRAW {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"draw\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"00115856\", \"00498547\", \"00560366\", \"00573322\", \"03237949\", \"03238126\", \"07368316\", \"10052401\", \"09292788\"]}");
	add("{\"term\":\"drawback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05172048\"]}");
	add("{\"term\":\"drawbar\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03238327\"]}");
	add("{\"term\":\"drawbridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03238447\"]}");
	add("{\"term\":\"drawee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10052067\"]}");
	add("{\"term\":\"drawer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"10048793\", \"10052249\", \"03238608\"]}");
	add("{\"term\":\"drawers\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02857998\", \"03238867\"]}");
	add("{\"term\":\"drawing\", \"synsetCount\":6, \"upperType\":\"NOUN\", \"ids\":[\"00116487\", \"00392901\", \"00509102\", \"00937756\", \"03239009\", \"07016235\"]}");
	add("{\"term\":\"drawknife\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03240030\"]}");
	add("{\"term\":\"drawl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07146449\"]}");
	add("{\"term\":\"drawler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10052609\"]}");
	add("{\"term\":\"drawnwork\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03240136\"]}");
	add("{\"term\":\"drawshave\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03240030\"]}");
	add("{\"term\":\"drawstring\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03240263\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }