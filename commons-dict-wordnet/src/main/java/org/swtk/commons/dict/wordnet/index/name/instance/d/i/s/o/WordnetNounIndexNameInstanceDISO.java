package org.swtk.commons.dict.wordnet.index.name.instance.d.i.s.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceDISO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"disobedience\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04916591\", \"01182197\"]}");
	add("{\"term\":\"disorder\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13996244\", \"14522846\", \"14075885\"]}");
	add("{\"term\":\"disorderliness\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"04904781\", \"14000631\", \"14522846\"]}");
	add("{\"term\":\"disorganisation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00553959\", \"14523925\"]}");
	add("{\"term\":\"disorganization\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00553959\", \"14523925\"]}");
	add("{\"term\":\"disorientation\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05691808\", \"05907037\"]}");
	add("{\"term\":\"disowning\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07222520\"]}");
	add("{\"term\":\"disownment\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07222520\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }