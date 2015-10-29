package org.swtk.commons.dict.wordnet.indexbyname.instance.a.p.l;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceAPL {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"aplacophora\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01956981\"]}");
	add("{\"term\":\"aplacophoran\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01957157\"]}");
	add("{\"term\":\"aplasia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14047372\"]}");
	add("{\"term\":\"aplastic anaemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14187823\"]}");
	add("{\"term\":\"aplastic anemia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14187823\"]}");
	add("{\"term\":\"aplectrum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12065821\"]}");
	add("{\"term\":\"aplectrum hyemale\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12065983\"]}");
	add("{\"term\":\"aplite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14750663\"]}");
	add("{\"term\":\"aplodontia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02366470\"]}");
	add("{\"term\":\"aplodontia rufa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02366648\"]}");
	add("{\"term\":\"aplodontiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02366333\"]}");
	add("{\"term\":\"aplomb\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04911339\"]}");
	add("{\"term\":\"aplysia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01953748\"]}");
	add("{\"term\":\"aplysia punctata\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01953915\"]}");
	add("{\"term\":\"aplysiidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01953593\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }