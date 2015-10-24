package org.swtk.commons.dict.wiktionary.generated.i.d.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryIDI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("idiot", "{\"term\":\"idiot\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|ID|gloss1\u003dintelligent design|idiot|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A proponent of intelligent design\", \"priority\":1}]}, \"synonyms\":{}}");

	add("idioblast", "{\"term\":\"idioblast\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|idio|blast|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An isolated specialised cell found in the midst of an otherwise homogeneous group of cells in plant tissue\", \"priority\":1}]}, \"synonyms\":{}}");

	add("idiolect", "{\"term\":\"idiolect\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|idio|lect|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The language variant used by a specific individual\", \"priority\":1}]}, \"synonyms\":{}}");

	add("idiomaticity", "{\"term\":\"idiomaticity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{suffix|idiomatic|ity|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being idiomatic\", \"priority\":1}]}, \"synonyms\":{}}");

	add("idiopathy", "{\"term\":\"idiopathy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|idio|pathy|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Something idiopathic; a disease having no known cause\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1970\u0027\u0027, D. V. Salcedo and M. G. Mujica \u0026quot;A Study of Sterilized Women in the Urban Communities of the Western Area of Santiago, 1963-1966,\u0026quot; \u0027The Journal of Sex Research\u0027, vol. 6, no. 1, p. 42\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The sterilization that was first conceived as a recourse of limited medical reach came to be considered as an efficient eugenical procedure that could prevent descendents with hereditary and transmissible disorders, such as mental deficiency, epilepsy, \u0027\u0027idiopathies\u0027\u0027, etc\", \"priority\":3}]}, \"synonyms\":{}}");

	add("idiophone", "{\"term\":\"idiophone\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any musical instrument that produces its sound by its own vibration (without any strings or membranes\", \"priority\":1}]}, \"synonyms\":{}}");

	add("idiosyncrasy", "{\"term\":\"idiosyncrasy\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\"], \"text\":\"First attested in 1604, in modern sense since 1665, from Old french (842-ca. 1400) \u0027idiosyncrasie\u0027 from Ancient greek (to 1453) \u0027ἰδιοσυγκρασία\u0027 (one’s own temperament) from \u0027ἴδιος\u0027 (one’s own) + \u0027σύν\u0027 (together) + \u0027κρᾶσις\u0027 (temperament)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A behavior or way of thinking that is characteristic of a person\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A language or behaviour that is particular to an individual or group\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A peculiar individual reaction to a generally innocuous substance or factor\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A peculiarity that serves to distinguish or identify\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"He mastered the \u0027\u0027idiosyncrasies\u0027\u0027 of English spelling\", \"priority\":5}]}, \"synonyms\":{}}");

	add("idiotype", "{\"term\":\"idiotype\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|idio|type|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A characteristic shared by a group of immunoglobulin or T cell receptor molecules, based on the antigen binding specificity of their variable regio\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"we stained µ i/ i/ B cells and controls with the Ac146, an antibody that recognizes the \u0027\u0027idiotype\u0027\u0027 produced by the V B1-8 DJ H - V 3-83 J replacement combination (19\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }