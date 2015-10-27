package org.swtk.commons.dict.wordnet.index.name.instance.m.u.s.k;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMUSK {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"musk\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05722279\", \"14870816\"]}");
	add("{\"term\":\"muskat\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13168571\"]}");
	add("{\"term\":\"muskellunge\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02564145\", \"07795511\"]}");
	add("{\"term\":\"musket\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03807547\"]}");
	add("{\"term\":\"musketeer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10361177\"]}");
	add("{\"term\":\"musketry\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"05651456\", \"08406169\"]}");
	add("{\"term\":\"muskhogean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06926089\", \"09681743\"]}");
	add("{\"term\":\"muskiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04988293\"]}");
	add("{\"term\":\"muskmelon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"07771683\", \"12184880\"]}");
	add("{\"term\":\"muskogean\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"06926089\", \"09681743\"]}");
	add("{\"term\":\"muskogee\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"06925513\", \"09155162\", \"09682030\"]}");
	add("{\"term\":\"muskrat\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02340797\", \"14789754\"]}");
	add("{\"term\":\"muskwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12018786\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }