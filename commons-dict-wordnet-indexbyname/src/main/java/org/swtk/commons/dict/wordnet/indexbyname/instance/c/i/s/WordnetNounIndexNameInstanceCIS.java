package org.swtk.commons.dict.wordnet.indexbyname.instance.c.i.s;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCIS {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08312059\"]}");
	add("{\"term\":\"cisc\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04939738\", \"08360029\"]}");
	add("{\"term\":\"cisco\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02542204\", \"07811435\"]}");
	add("{\"term\":\"cistaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12394519\"]}");
	add("{\"term\":\"cistercian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10746040\"]}");
	add("{\"term\":\"cistern\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03039495\", \"03039700\", \"05524362\"]}");
	add("{\"term\":\"cisterna\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05524362\"]}");
	add("{\"term\":\"cistothorus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01587635\"]}");
	add("{\"term\":\"cistothorus palustris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01587928\"]}");
	add("{\"term\":\"cistothorus platensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01588063\"]}");
	add("{\"term\":\"cistron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05444328\"]}");
	add("{\"term\":\"cistus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12394755\"]}");
	add("{\"term\":\"cistus albidus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12395222\"]}");
	add("{\"term\":\"cistus ladanifer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12395379\"]}");
	add("{\"term\":\"cistus ladanum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12395379\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }