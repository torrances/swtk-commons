package org.swtk.commons.dict.wordnet.indexbyname.instance.d.u.p;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDUP {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"dupe\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10772148\"]}");
	add("{\"term\":\"dupery\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00755028\"]}");
	add("{\"term\":\"duple time\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15288979\"]}");
	add("{\"term\":\"duplex\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03261768\", \"03261913\"]}");
	add("{\"term\":\"duplex apartment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03261768\"]}");
	add("{\"term\":\"duplex house\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03261913\"]}");
	add("{\"term\":\"duplicability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04813397\"]}");
	add("{\"term\":\"duplicate\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03262046\", \"03312926\"]}");
	add("{\"term\":\"duplication\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01021645\", \"03262046\"]}");
	add("{\"term\":\"duplicator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03262289\"]}");
	add("{\"term\":\"duplicidentata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02325644\"]}");
	add("{\"term\":\"duplicity\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00754583\", \"06773680\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }