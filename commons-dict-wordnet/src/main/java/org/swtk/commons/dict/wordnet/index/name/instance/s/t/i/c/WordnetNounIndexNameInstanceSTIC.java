package org.swtk.commons.dict.wordnet.index.name.instance.s.t.i.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSTIC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"stichaeidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02618124\"]}");
	add("{\"term\":\"sticherus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13191939\"]}");
	add("{\"term\":\"stick\", \"synsetCount\":9, \"upperType\":\"NOUN\", \"ids\":[\"01165418\", \"03606019\", \"04324971\", \"04325269\", \"05569340\", \"07864621\", \"04325114\", \"13186544\", \"04324558\"]}");
	add("{\"term\":\"stickball\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00477246\"]}");
	add("{\"term\":\"sticker\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"03163551\", \"06798224\", \"07287250\", \"13110391\"]}");
	add("{\"term\":\"stickiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04942416\"]}");
	add("{\"term\":\"stickleback\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01457497\"]}");
	add("{\"term\":\"stickler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10675425\"]}");
	add("{\"term\":\"stickpin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04325828\"]}");
	add("{\"term\":\"sticktight\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02190552\", \"11960475\"]}");
	add("{\"term\":\"stickup\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00783566\"]}");
	add("{\"term\":\"stickweed\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12841052\"]}");
	add("{\"term\":\"stictomys\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02369105\"]}");
	add("{\"term\":\"stictopelia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01816452\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }