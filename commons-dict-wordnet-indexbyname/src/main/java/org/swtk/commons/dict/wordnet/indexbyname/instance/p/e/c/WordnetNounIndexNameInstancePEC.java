package org.swtk.commons.dict.wordnet.indexbyname.instance.p.e.c;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstancePEC {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"pecan\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07790695\", \"12341594\", \"12341821\"]}");
	add("{\"term\":\"peccadillo\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00740083\"]}");
	add("{\"term\":\"peccary\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02400181\"]}");
	add("{\"term\":\"peck\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"13641994\", \"13643732\", \"13796604\"]}");
	add("{\"term\":\"pecker\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"01760949\", \"01841239\", \"05534354\"]}");
	add("{\"term\":\"peckerwood\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01841239\"]}");
	add("{\"term\":\"pecopteris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11565801\"]}");
	add("{\"term\":\"pecos\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09411014\"]}");
	add("{\"term\":\"pecs\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05559344\"]}");
	add("{\"term\":\"pectin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15002791\"]}");
	add("{\"term\":\"pectinibranchia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01955453\"]}");
	add("{\"term\":\"pectinidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01968388\"]}");
	add("{\"term\":\"pectoral\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"03909368\", \"05559344\"]}");
	add("{\"term\":\"pectoralis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05559344\"]}");
	add("{\"term\":\"pectus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05560240\"]}");
	add("{\"term\":\"peculation\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00778229\"]}");
	add("{\"term\":\"peculator\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10071145\"]}");
	add("{\"term\":\"peculiarity\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"03154617\", \"04771180\", \"05860690\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }