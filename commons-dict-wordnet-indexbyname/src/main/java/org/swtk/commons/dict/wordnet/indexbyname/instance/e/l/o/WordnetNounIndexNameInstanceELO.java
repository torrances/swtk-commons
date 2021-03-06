package org.swtk.commons.dict.wordnet.indexbyname.instance.e.l.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceELO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"elocution\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07097438\"]}");
	add("{\"term\":\"elocutionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10070688\"]}");
	add("{\"term\":\"elodea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12635078\"]}");
	add("{\"term\":\"elodea canadensis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12635386\"]}");
	add("{\"term\":\"elodea densa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12635524\"]}");
	add("{\"term\":\"elongate leaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13179410\"]}");
	add("{\"term\":\"elongation\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00406828\", \"03286846\", \"05141104\"]}");
	add("{\"term\":\"elopement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00059428\"]}");
	add("{\"term\":\"elopidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02544062\"]}");
	add("{\"term\":\"elops\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02544506\"]}");
	add("{\"term\":\"elops saurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02544648\"]}");
	add("{\"term\":\"eloquence\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07083250\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }