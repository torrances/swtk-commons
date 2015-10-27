package org.swtk.commons.dict.wordnet.index.name.instance.t.e.t.r;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceTETR {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"tetra\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02586521\"]}");
	add("{\"term\":\"tetracaine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04423336\"]}");
	add("{\"term\":\"tetrachlorethylene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04423473\"]}");
	add("{\"term\":\"tetrachloride\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15093321\"]}");
	add("{\"term\":\"tetrachloroethylene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04423473\"]}");
	add("{\"term\":\"tetrachloromethane\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14822209\"]}");
	add("{\"term\":\"tetraclinis\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11663363\"]}");
	add("{\"term\":\"tetracycline\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04423665\"]}");
	add("{\"term\":\"tetrad\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13766444\"]}");
	add("{\"term\":\"tetrafluoroethylene\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15093458\"]}");
	add("{\"term\":\"tetragon\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13901783\"]}");
	add("{\"term\":\"tetragonia\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11842636\"]}");
	add("{\"term\":\"tetragoniaceae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11839414\"]}");
	add("{\"term\":\"tetragonurus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02637347\"]}");
	add("{\"term\":\"tetragram\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06372257\"]}");
	add("{\"term\":\"tetragrammaton\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06372403\"]}");
	add("{\"term\":\"tetrahalide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15093613\"]}");
	add("{\"term\":\"tetrahedron\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13938146\"]}");
	add("{\"term\":\"tetrahydrocannabinol\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04423920\"]}");
	add("{\"term\":\"tetrahymena\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01398963\"]}");
	add("{\"term\":\"tetraiodothyronine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05420990\"]}");
	add("{\"term\":\"tetralogy\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06634759\"]}");
	add("{\"term\":\"tetrameter\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07110695\"]}");
	add("{\"term\":\"tetramethyldiarsine\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14813045\"]}");
	add("{\"term\":\"tetraneuris\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"12045488\"]}");
	add("{\"term\":\"tetranychid\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01784850\"]}");
	add("{\"term\":\"tetranychidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01784691\"]}");
	add("{\"term\":\"tetrao\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01799511\"]}");
	add("{\"term\":\"tetraodontidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02657520\"]}");
	add("{\"term\":\"tetraonidae\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01797454\"]}");
	add("{\"term\":\"tetrapod\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02159384\"]}");
	add("{\"term\":\"tetrapturus\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"02634529\"]}");
	add("{\"term\":\"tetrasaccharide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15093728\"]}");
	add("{\"term\":\"tetraskele\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04424036\"]}");
	add("{\"term\":\"tetraskelion\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04424036\"]}");
	add("{\"term\":\"tetrasporangium\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13114034\"]}");
	add("{\"term\":\"tetraspore\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11570230\"]}");
	add("{\"term\":\"tetrazzini\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07880614\"]}");
	add("{\"term\":\"tetri\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13722871\"]}");
	add("{\"term\":\"tetrode\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"04424221\"]}");
	add("{\"term\":\"tetrodotoxin\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15093905\"]}");
	add("{\"term\":\"tetrose\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14714101\"]}");
	add("{\"term\":\"tetroxide\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15094039\"]}");
	add("{\"term\":\"tetryl\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"15094151\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }