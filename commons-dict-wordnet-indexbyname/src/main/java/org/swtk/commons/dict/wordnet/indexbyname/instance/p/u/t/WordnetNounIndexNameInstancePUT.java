package org.swtk.commons.dict.wordnet.indexbyname.instance.p.u.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePUT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"put\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00081788\"]}");
	add("{\"term\":\"putamen\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05506111\"]}");
	add("{\"term\":\"putin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11269312\"]}");
	add("{\"term\":\"putoff\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06772685\"]}");
	add("{\"term\":\"putout\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00130913\"]}");
	add("{\"term\":\"putrajaya\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08983758\"]}");
	add("{\"term\":\"putrefaction\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04858227\", \"13479192\", \"14584518\"]}");
	add("{\"term\":\"putrescence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04798804\", \"14584694\"]}");
	add("{\"term\":\"putrescine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14887328\"]}");
	add("{\"term\":\"putridity\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14511784\"]}");
	add("{\"term\":\"putridness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14584694\"]}");
	add("{\"term\":\"putsch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01147528\"]}");
	add("{\"term\":\"putt\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00573875\"]}");
	add("{\"term\":\"puttee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04034411\"]}");
	add("{\"term\":\"putter\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04034550\", \"10515666\"]}");
	add("{\"term\":\"putterer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10515778\"]}");
	add("{\"term\":\"putting\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00573875\"]}");
	add("{\"term\":\"putty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14727958\"]}");
	add("{\"term\":\"puttyroot\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12065983\"]}");
	add("{\"term\":\"putz\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05534354\", \"10515978\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }