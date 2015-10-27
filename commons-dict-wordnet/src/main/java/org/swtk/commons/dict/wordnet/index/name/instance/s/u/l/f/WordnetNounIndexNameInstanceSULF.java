package org.swtk.commons.dict.wordnet.index.name.instance.s.u.l.f;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceSULF {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"sulfa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04359148\"]}");
	add("{\"term\":\"sulfacetamide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04358854\"]}");
	add("{\"term\":\"sulfadiazine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04359014\"]}");
	add("{\"term\":\"sulfamethazine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04359513\"]}");
	add("{\"term\":\"sulfamethoxazole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04359658\"]}");
	add("{\"term\":\"sulfamezathine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04359513\"]}");
	add("{\"term\":\"sulfanilamide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04359837\"]}");
	add("{\"term\":\"sulfapyridine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04359984\"]}");
	add("{\"term\":\"sulfate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15088060\"]}");
	add("{\"term\":\"sulfide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15088266\"]}");
	add("{\"term\":\"sulfisoxazole\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04360094\"]}");
	add("{\"term\":\"sulfonamide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04359148\"]}");
	add("{\"term\":\"sulfonate\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14640588\"]}");
	add("{\"term\":\"sulfonylurea\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04360267\"]}");
	add("{\"term\":\"sulfur\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14680398\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }