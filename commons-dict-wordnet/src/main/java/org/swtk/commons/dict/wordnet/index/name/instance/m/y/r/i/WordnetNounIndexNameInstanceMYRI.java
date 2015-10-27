package org.swtk.commons.dict.wordnet.index.name.instance.m.y.r.i;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMYRI {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"myriad\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13773405\", \"13798938\"]}");
	add("{\"term\":\"myriagram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13747087\"]}");
	add("{\"term\":\"myriameter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13682017\"]}");
	add("{\"term\":\"myriametre\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13682017\"]}");
	add("{\"term\":\"myriapod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01785658\"]}");
	add("{\"term\":\"myriapoda\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01789043\"]}");
	add("{\"term\":\"myrica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11761479\"]}");
	add("{\"term\":\"myricaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11761293\"]}");
	add("{\"term\":\"myricales\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11761124\"]}");
	add("{\"term\":\"myricaria\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12407241\"]}");
	add("{\"term\":\"myringa\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05326381\"]}");
	add("{\"term\":\"myringectomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00689810\"]}");
	add("{\"term\":\"myringoplasty\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00689900\"]}");
	add("{\"term\":\"myringotomy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00690019\"]}");
	add("{\"term\":\"myriophyllum\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12347359\"]}");
	add("{\"term\":\"myristica\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11734619\"]}");
	add("{\"term\":\"myristicaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11734429\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public boolean has(final String TERM) { 		return map.containsKey(TERM); 	} }