package org.swtk.commons.dict.wordnet.indexbyname.instance.m.i.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceMIG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"might\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05037846\"]}");
	add("{\"term\":\"mightiness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05037846\"]}");
	add("{\"term\":\"mighty mouse\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02454978\"]}");
	add("{\"term\":\"mignonette\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12406083\"]}");
	add("{\"term\":\"mignonette family\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12405563\"]}");
	add("{\"term\":\"migraine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14351112\"]}");
	add("{\"term\":\"migrant\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10334610\"]}");
	add("{\"term\":\"migrant shrike\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01602382\"]}");
	add("{\"term\":\"migrant worker\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10719072\"]}");
	add("{\"term\":\"migration\", \"synsetCount\":4, \"upperType\":\"NOUN\", \"ids\":[\"07327216\", \"07327429\", \"07983035\", \"01125416\"]}");
	add("{\"term\":\"migration route\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08635197\"]}");
	add("{\"term\":\"migrator\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01320969\", \"10334610\"]}");
	add("{\"term\":\"migratory grasshopper\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02230256\"]}");
	add("{\"term\":\"migratory locust\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02229899\"]}");
	add("{\"term\":\"migratory quail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01807711\"]}");
	add("{\"term\":\"miguel de cervantes\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10908784\"]}");
	add("{\"term\":\"miguel de cervantes saavedra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10908784\"]}");
	add("{\"term\":\"miguel jose serra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11313460\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }