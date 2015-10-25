package org.swtk.commons.dict.wiktionary.generated.d.i.h;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryDIH000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("dihalide", "{\"term\":\"dihalide\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any halide containing two halogen atoms per molecule\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dihedral", "{\"term\":\"dihedral\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|di|hedral|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An angle between two plane surface\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The upward slope of an aircraft\u0027s win\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The angle between pairs of chemical bonds separated by a third bond\", \"priority\":3}]}, \"synonyms\":{}}");

	add("dihedron", "{\"term\":\"dihedron\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|di|hedron|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A polyhedron having two faces\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dihydride", "{\"term\":\"dihydride\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any hydride containing two atoms of hydrogen per molecule\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dihydro", "{\"term\":\"dihydro\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Two hydrogen atoms in a molecule\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dihydroartemisinin", "{\"term\":\"dihydroartemisinin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|di-|hydro-|artemisinin|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An antimalarial drug, the active metabolite of all artemisinin compounds, also available as a drug in itself\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dihydrocodeine", "{\"term\":\"dihydrocodeine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular narcotic painkiller\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dihydrogen", "{\"term\":\"dihydrogen\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The divalent radical formed from two separate hydrogen atoms or ions\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Describing a dihydrogen bond\", \"priority\":2}]}, \"synonyms\":{}}");

	add("dihydroxo", "{\"term\":\"dihydroxo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Two hydroxy groups in a molecule\", \"priority\":1}]}, \"synonyms\":{}}");

	add("dihydroxyphenylalanine", "{\"term\":\"dihydroxyphenylalanine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Abbreviated as\u0027: dopa or DOPA\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Either of two enantiomers of a derivative of the amino acid tyrosine\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }