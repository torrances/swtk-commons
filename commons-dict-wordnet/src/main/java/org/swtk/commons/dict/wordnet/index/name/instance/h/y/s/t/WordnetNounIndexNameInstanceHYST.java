package org.swtk.commons.dict.wordnet.index.name.instance.h.y.s.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceHYST {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"hysterectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00678417\"]}");
	add("{\"term\":\"hysteresis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11487718\"]}");
	add("{\"term\":\"hysteria\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"14416843\", \"07535746\", \"14415281\"]}");
	add("{\"term\":\"hysteric\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10215665\"]}");
	add("{\"term\":\"hysterics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14106466\"]}");
	add("{\"term\":\"hysterocatalepsy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14417267\"]}");
	add("{\"term\":\"hysterosalpingogram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03561176\"]}");
	add("{\"term\":\"hysteroscopy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00644153\"]}");
	add("{\"term\":\"hysterotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00678542\"]}");
	add("{\"term\":\"hystricidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02349475\"]}");
	add("{\"term\":\"hystricomorpha\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02348967\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }