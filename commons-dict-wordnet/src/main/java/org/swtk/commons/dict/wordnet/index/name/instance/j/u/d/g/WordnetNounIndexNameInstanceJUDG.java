package org.swtk.commons.dict.wordnet.index.name.instance.j.u.d.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceJUDG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"judge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10086539\", \"10244889\"]}");
	add("{\"term\":\"judgement\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"00875745\", \"01190300\", \"04899279\", \"05621958\", \"05797437\", \"05846466\", \"06563775\"]}");
	add("{\"term\":\"judges\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06445835\"]}");
	add("{\"term\":\"judgeship\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00595059\"]}");
	add("{\"term\":\"judging\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05797437\"]}");
	add("{\"term\":\"judgment\", \"synsetCount\":7, \"upperType\":\"NOUN\", \"ids\":[\"05621958\", \"04899279\", \"06563775\", \"05797437\", \"01190300\", \"00875745\", \"05846466\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }