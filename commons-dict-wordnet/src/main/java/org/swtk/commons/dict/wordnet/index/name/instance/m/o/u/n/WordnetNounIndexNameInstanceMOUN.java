package org.swtk.commons.dict.wordnet.index.name.instance.m.o.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMOUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mound\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"00724235\", \"03797581\", \"07978094\", \"09349568\", \"03797867\"]}");
	add("{\"term\":\"mount\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02772465\", \"03798059\", \"09382700\", \"00325936\", \"02380355\"]}");
	add("{\"term\":\"mountain\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13796604\", \"09382700\"]}");
	add("{\"term\":\"mountaineer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10354280\"]}");
	add("{\"term\":\"mountaineering\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00326611\"]}");
	add("{\"term\":\"mountainside\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09384414\"]}");
	add("{\"term\":\"mountebank\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10354495\"]}");
	add("{\"term\":\"mounter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10354670\", \"10354836\"]}");
	add("{\"term\":\"mountie\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10559671\"]}");
	add("{\"term\":\"mounties\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08227591\"]}");
	add("{\"term\":\"mounting\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03798719\", \"07385010\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }