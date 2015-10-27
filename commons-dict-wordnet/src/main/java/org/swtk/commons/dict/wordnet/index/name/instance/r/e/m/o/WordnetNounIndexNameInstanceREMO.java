package org.swtk.commons.dict.wordnet.index.name.instance.r.e.m.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREMO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"remonstrance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07261402\"]}");
	add("{\"term\":\"remonstration\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07261402\"]}");
	add("{\"term\":\"remora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02577541\"]}");
	add("{\"term\":\"remorse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07551462\"]}");
	add("{\"term\":\"remote\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04082075\"]}");
	add("{\"term\":\"remoteness\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"04664353\", \"05092372\"]}");
	add("{\"term\":\"remotion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00392407\"]}");
	add("{\"term\":\"remount\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02380801\"]}");
	add("{\"term\":\"removal\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00217590\", \"00392407\"]}");
	add("{\"term\":\"remove\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05097462\"]}");
	add("{\"term\":\"remover\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10539577\", \"15028536\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }