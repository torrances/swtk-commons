package org.swtk.commons.dict.wordnet.indexbyname.instance.c.u.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceCUN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"cunaxa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01279368\"]}");
	add("{\"term\":\"cunctation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01069286\"]}");
	add("{\"term\":\"cunctator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10498211\"]}");
	add("{\"term\":\"cuneate leaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13178756\"]}");
	add("{\"term\":\"cuneiform\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06373042\"]}");
	add("{\"term\":\"cuneiform bone\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05280044\"]}");
	add("{\"term\":\"cuneus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13942580\"]}");
	add("{\"term\":\"cuniculus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02368855\"]}");
	add("{\"term\":\"cuniculus paca\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02368953\"]}");
	add("{\"term\":\"cunner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02613003\"]}");
	add("{\"term\":\"cunnilinctus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00856684\"]}");
	add("{\"term\":\"cunnilingus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00856684\"]}");
	add("{\"term\":\"cunning\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04884083\", \"05628961\"]}");
	add("{\"term\":\"cunningham\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10937306\"]}");
	add("{\"term\":\"cunonia family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12807767\"]}");
	add("{\"term\":\"cunoniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12807767\"]}");
	add("{\"term\":\"cunt\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05529165\", \"10002403\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }