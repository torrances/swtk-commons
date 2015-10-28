package org.swtk.commons.dict.wordnet.indexbyname.instance.a.d.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceADO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"ado\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00556175\"]}");
	add("{\"term\":\"adobe\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02684246\", \"14625105\"]}");
	add("{\"term\":\"adobo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07595482\"]}");
	add("{\"term\":\"adolescence\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"14450314\", \"15172810\"]}");
	add("{\"term\":\"adolescent\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09791452\"]}");
	add("{\"term\":\"adonic\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06396723\"]}");
	add("{\"term\":\"adonis\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"09570758\", \"11744998\", \"10308625\"]}");
	add("{\"term\":\"adoptee\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09791753\"]}");
	add("{\"term\":\"adopter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09791871\"]}");
	add("{\"term\":\"adoption\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"00085191\", \"01187782\", \"00181262\"]}");
	add("{\"term\":\"adorability\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04693606\"]}");
	add("{\"term\":\"adorableness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04693606\"]}");
	add("{\"term\":\"adoration\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01046021\", \"01221256\", \"07516659\"]}");
	add("{\"term\":\"adorer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09790858\"]}");
	add("{\"term\":\"adornment\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00263439\", \"02684372\"]}");
	add("{\"term\":\"adoxography\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00932296\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }