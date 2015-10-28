package org.swtk.commons.dict.wordnet.indexbyname.instance.f.l.y;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceFLY {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"fly\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"03378083\", \"00129458\", \"03377906\", \"04419232\", \"02192818\"]}");
	add("{\"term\":\"flybridge\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03378598\"]}");
	add("{\"term\":\"flycatcher\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01550473\", \"01558450\"]}");
	add("{\"term\":\"flyer\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09845606\", \"10115986\", \"07265007\"]}");
	add("{\"term\":\"flying\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00303220\"]}");
	add("{\"term\":\"flyleaf\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06267071\"]}");
	add("{\"term\":\"flyover\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00304123\", \"03871095\"]}");
	add("{\"term\":\"flypaper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14896723\"]}");
	add("{\"term\":\"flypast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00304123\"]}");
	add("{\"term\":\"flyspeck\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14894126\"]}");
	add("{\"term\":\"flyswat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04376369\"]}");
	add("{\"term\":\"flyswatter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04376369\"]}");
	add("{\"term\":\"flytrap\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03379416\"]}");
	add("{\"term\":\"flyway\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08635197\"]}");
	add("{\"term\":\"flyweight\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10118286\", \"10118393\"]}");
	add("{\"term\":\"flywheel\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03379495\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }