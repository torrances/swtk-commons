package org.swtk.commons.dict.wordnet.index.name.instance.g.y.m.n;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGYMN {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gymnadenia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12084684\"]}");
	add("{\"term\":\"gymnadeniopsis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12085315\"]}");
	add("{\"term\":\"gymnasium\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03477235\", \"08301402\"]}");
	add("{\"term\":\"gymnast\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10173163\"]}");
	add("{\"term\":\"gymnastics\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00434742\"]}");
	add("{\"term\":\"gymnelis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02620319\"]}");
	add("{\"term\":\"gymnocalycium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11867883\"]}");
	add("{\"term\":\"gymnocarpium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13217983\"]}");
	add("{\"term\":\"gymnocladus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12516712\"]}");
	add("{\"term\":\"gymnogyps\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01622644\"]}");
	add("{\"term\":\"gymnomycota\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12995967\"]}");
	add("{\"term\":\"gymnophiona\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01657598\"]}");
	add("{\"term\":\"gymnopilus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13096941\"]}");
	add("{\"term\":\"gymnorhina\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01586277\"]}");
	add("{\"term\":\"gymnosophist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10173293\"]}");
	add("{\"term\":\"gymnosophy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05971281\"]}");
	add("{\"term\":\"gymnosperm\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11616559\"]}");
	add("{\"term\":\"gymnospermae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11615763\"]}");
	add("{\"term\":\"gymnospermophyta\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11615763\"]}");
	add("{\"term\":\"gymnosporangium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13085975\"]}");
	add("{\"term\":\"gymnura\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01501218\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }