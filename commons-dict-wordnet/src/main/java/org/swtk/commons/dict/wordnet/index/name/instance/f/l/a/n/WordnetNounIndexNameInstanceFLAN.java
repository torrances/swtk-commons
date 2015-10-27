package org.swtk.commons.dict.wordnet.index.name.instance.f.l.a.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLAN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"flan\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07626876\"]}");
	add("{\"term\":\"flanders\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08868541\"]}");
	add("{\"term\":\"flange\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03361704\"]}");
	add("{\"term\":\"flank\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"02466854\", \"07673366\", \"13920070\", \"08499124\"]}");
	add("{\"term\":\"flanker\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10114830\", \"10115034\"]}");
	add("{\"term\":\"flannel\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03361927\", \"04561809\", \"03361828\"]}");
	add("{\"term\":\"flannelbush\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12219310\"]}");
	add("{\"term\":\"flannelette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03362113\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }