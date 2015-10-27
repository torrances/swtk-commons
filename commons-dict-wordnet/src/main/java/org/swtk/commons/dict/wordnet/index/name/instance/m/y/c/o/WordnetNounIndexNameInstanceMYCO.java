package org.swtk.commons.dict.wordnet.index.name.instance.m.y.c.o;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMYCO {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"mycobacteria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01379733\"]}");
	add("{\"term\":\"mycobacteriaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01379442\"]}");
	add("{\"term\":\"mycobacterium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01379733\"]}");
	add("{\"term\":\"mycologist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10362819\"]}");
	add("{\"term\":\"mycology\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06079297\"]}");
	add("{\"term\":\"mycomycin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03809028\"]}");
	add("{\"term\":\"mycophage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10362942\"]}");
	add("{\"term\":\"mycophagist\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10362942\"]}");
	add("{\"term\":\"mycophagy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00412872\"]}");
	add("{\"term\":\"mycoplasma\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01376467\"]}");
	add("{\"term\":\"mycoplasmataceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01376081\"]}");
	add("{\"term\":\"mycoplasmatales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01375913\"]}");
	add("{\"term\":\"mycosis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14200377\"]}");
	add("{\"term\":\"mycostatin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03842677\"]}");
	add("{\"term\":\"mycotoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15061103\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }