package org.swtk.commons.dict.wordnet.index.name.instance.r.e.v.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceREVI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"review\", \"synsetCount\":10, \"upperType\":\"NOUN\", \"ids\":[\"00880949\", \"00899509\", \"01199748\", \"06481048\", \"06610111\", \"07032980\", \"13432706\", \"00144071\", \"06422034\", \"05755527\"]}");
	add("{\"term\":\"reviewer\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"09961910\", \"10546502\"]}");
	add("{\"term\":\"revilement\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06728162\"]}");
	add("{\"term\":\"revisal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06440646\"]}");
	add("{\"term\":\"revise\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06440646\"]}");
	add("{\"term\":\"reviser\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10532713\"]}");
	add("{\"term\":\"revising\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06440462\"]}");
	add("{\"term\":\"revision\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06375556\", \"06440646\", \"00400201\"]}");
	add("{\"term\":\"revisionism\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08385443\", \"08385558\"]}");
	add("{\"term\":\"revisionist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10546722\"]}");
	add("{\"term\":\"revitalisation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01049262\"]}");
	add("{\"term\":\"revitalization\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01049262\"]}");
	add("{\"term\":\"revival\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"08402874\", \"01049262\"]}");
	add("{\"term\":\"revivalism\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06241310\"]}");
	add("{\"term\":\"revivalist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10086818\"]}");
	add("{\"term\":\"revivification\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01049262\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }