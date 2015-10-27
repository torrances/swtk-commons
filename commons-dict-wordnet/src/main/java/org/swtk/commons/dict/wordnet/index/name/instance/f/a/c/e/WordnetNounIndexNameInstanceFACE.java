package org.swtk.commons.dict.wordnet.index.name.instance.f.a.c.e;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFACE {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"face\", \"synsetCount\":13, \"upperType\":\"NOUN\", \"ids\":[\"03318401\", \"04845441\", \"05176322\", \"06838449\", \"06890628\", \"03318547\", \"05608953\", \"08527687\", \"09641987\", \"03318818\", \"04686776\", \"04687095\", \"05608392\"]}");
	add("{\"term\":\"facelift\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00266316\", \"00675401\"]}");
	add("{\"term\":\"faceplate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03319553\"]}");
	add("{\"term\":\"facer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05696291\"]}");
	add("{\"term\":\"facet\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13936179\", \"05859151\"]}");
	add("{\"term\":\"facetiousness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04656917\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }